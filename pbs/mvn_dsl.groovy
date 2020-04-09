mavenJob('pbs_build_print') {
    logRotator(-1, 10)
    jdk('Java 8')
    scm {
        github('ivary43/pbs_in_train', 'week_one')
    }
    triggers {
       	scm('0 0 10 * * ?')
    }

    steps {
        shell("cd pbs/")
        shell("mvn clean")
        shell("mvn package")
        shell("cd target/")
        shell("java -jar pbs-0.0.1.jar")
    }
}