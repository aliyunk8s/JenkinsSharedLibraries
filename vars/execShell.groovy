def call(params) {
    sh '''
    hostname
    echo ${params}
    pwd
    ls
    ${params}
    '''
}
