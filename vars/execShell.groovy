def call(params) {
    sh "echo ${params}"
    sh '''
    hostname
    echo ${params}
    pwd
    ls
    ${params}
    '''
    sh "${params}"
}
