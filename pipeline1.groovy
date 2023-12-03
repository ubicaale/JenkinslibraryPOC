node(){
stage ('Clone work'){
    parallel (
        'Stage B1': {
              sh 'echo Initial Part Finished'
           },
         'Stage B2':{
            stage ('Stage A_1'){
              sh 'echo Ping Machine A'
            }
         },
        'Stage B3': {
          stage ("Stage A3"){
            sh ' echo Collect Info'
          }
        }
    )}
}
