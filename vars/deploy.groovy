def call(ProjectName, Tag){

  echo " this is deplyig the code"  
              
  sh "docker run -d -p 8000:8000 ${ProjectName}:${Tag}"
}
