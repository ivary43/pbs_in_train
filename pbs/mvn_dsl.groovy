job('pbs_build_print') {
    scm {
        github('ivary43/pbs_in_train', 'week_one')
    }

    triggers {
       	scm('0 * * ? * *')
    }

    steps {
    	shell("pwd")
        shell("cd pbs/")
        shell("pwd")
        shell("mvn clean")
        shell("mvn package")
        shell("cd target/")
        shell("java -jar pbs-0.0.1.jar")
    }
}