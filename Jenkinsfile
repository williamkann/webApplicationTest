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
            			sh 'mvn -B -DskipTests clean package'
				stash name: 'war', includes: 'target/**'
         		}
        	}
		stage('BackEnd') 
		{
			steps 
			{
				parallel(
					"Unit":  {sh 'echo Unit'},
					"Performance": {sh 'echo Performance'}
	
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

		stage('StaticAnalysis') 
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
