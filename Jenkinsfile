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
            			sh 'mvn clean compile'	
         		}
		}
		stage('Test Stage') 					
		{
			steps 
			{
				sh 'mvn test'
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
				sh 'echo Dceploy'
			}
		}
	}
}
