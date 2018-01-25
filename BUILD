jvm_binary(name='demo-bin',
           main='play.core.server.ProdServerStart',
           dependencies=[
               ':demo_lib',
           ])

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
        sources=rglobs('app/*.scala'),
        dependencies=[
                'conf:play-conf',
                ':public_assets',
                ':htmls',
                '3rdparty/jvm:guice',
                '3rdparty/jvm:scalatestplus',
                '3rdparty/jvm:h2',
#                rglobs('public/*'),
#                globs('app/views/*')
                ])

resources(name='public_assets', sources=rglobs('public/*'))
resources(name='htmls', sources=globs('app/views/*'))

