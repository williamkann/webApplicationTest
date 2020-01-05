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
				sh 'echo BackEnd'
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
				sh 'echo non'
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
