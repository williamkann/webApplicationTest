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
				sh 'mvn clean package'
				stash name: 'war', includes: 'target/**'
         		}
		}
		stage('Test Stage') 					
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
				unstash 'war'
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
	post {
       // only triggered when blue or green sign
       success {
           slackSend color: 'good', message: 'Build Successful !'
       }
       // triggered when red sign
       failure {
           slackSend color: 'good', message: 'Build failed !'
       }
       // trigger every-works
       always {
           slackSend color: 'good', message: 'Build Finished !'
       }
    }
}
