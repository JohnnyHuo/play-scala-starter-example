jvm_binary(name='demo-bin',
           main='play.core.server.ProdServerStart',
           dependencies=[
               ':demo_lib',
           ],
           deploy_jar_rules=jar_rules(rules=[
                        Duplicate('^reference\.conf', Duplicate.CONCAT_TEXT)])
           )

#
#scala_library(
#        name='demo_lib',
#        sources=[
#                globs('app/*.scala'),
#                globs('app/controllers/*.scala'),
#                globs('app/filters/*.scala'),
#                globs('app/services/*.scala'),
#                globs('app/views/*')
#                 ],
#        dependencies=[
#                'conf:play-conf',
#                ':public_assets',
#                '3rdparty/jvm:guice',
#                '3rdparty/jvm:scalatestplus',
#                '3rdparty/jvm:h2'
#                ])

#scala_library(
#        name='demo_lib',
#        sources=[rglobs('app/*.scala'), globs('app/views/*')],
#        dependencies=[
#                'conf:play-conf',
#                ':public_assets',
#                '3rdparty/jvm:guice',
#                '3rdparty/jvm:scalatestplus',
#                '3rdparty/jvm:h2'
#                ])

scala_library(
        name='demo_lib',
#        sources=rglobs('app/*.scala'),
        sources=['api/ApiRouter.scala',
                 'conf/MyApplicationLoader.scala',
                 'app/controllers/AsyncController.scala',
                 'app/controllers/CountController.scala',
                 'app/controllers/HomeController.scala',
                 'app/filters/ExampleFilter.scala',
                 'app/services/ApplicationTimer.scala',
                 'app/services/Counter.scala',
                 'app/Module.scala'
                 ],
        dependencies=[
                'conf:play-conf',
#                ':public_assets',
#                ':htmls',
                '3rdparty/jvm:guice',
#                '3rdparty/jvm:akka-http',
#                '3rdparty/jvm:scalatestplus',
#                '3rdparty/jvm:h2',
                '3rdparty/jvm:play',
#                '3rdparty/jvm:play-server',
#                '3rdparty/jvm:play-filter',
#                '3rdparty/jvm:play-netty-server'
#                rglobs('public/*'),
#                globs('app/views/*')
                ])

#resources(name='public_assets', sources=rglobs('public/*'))
#resources(name='htmls', sources=globs('app/views/*'))

