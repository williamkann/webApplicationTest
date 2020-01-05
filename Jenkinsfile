pipeline 
{
	agent any
	stages 
	{
	
        	stage('Build')
		{ 

			agent
			{
	      			docker
				{
		    			image 'maven:3-alpine' 
		    			args '-v /root/.m2:/root/.m2' 
				}
    			} 

            		steps 
			{
            			sh 'mvn --version'
				
         		}
        	}
		stage('BackEnd') 
		{
			steps 
			{
				parallel(
					"Unit":  
					{
						unstash 'war'
						sh 'mvn -B -DtestFailureIgnore test || exit 0'
						junit '**/surefire-reports/**/*.xml'
					},
					"Performance": 
					{
						unstash 'war'
						sh '# ./mvn -B gatling:execute'
					}
	
				)
			}
		}

		stage('FrontEnd') 
		{
			steps 
			{
				sh 'echo FrontEnd'
			}
		}

		stage('Analysis ') 
		{
			steps 
			{
				sh 'echo oui'
			}
		}
		stage('Deploy') 
		{
			steps 
			{
				sh 'echo Deploy'
			}
		}
	}
}
