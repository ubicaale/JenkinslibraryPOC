stage ('Initial Work'){
    parallel (
        'Stage A': {
           stage('Stage A') {
              sh 'echo Initial Part'
           }},
         'Stage B':{
            stage ('Stage A_1'){
              sh 'echo Ping Machine A'
            }
         },
        'Stage C': {
          stage ("Stage A3"){
            sh ' echo Collect Info'
          }
        }
    )}
stage ('Finish Work'){
  sh 'echo Finished'
  cleanWs()
}
          
