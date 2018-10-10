<!DOCTYPE html>
<html xml:lang="${cmsfn.language()}" lang="${cmsfn.language()}">
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      [@cms.page /]
      <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
      <title>${content.windowTitle!content.title!}</title>
      <!-- Bootstrap -->
      <link rel="stylesheet" type="text/css" href="${ctx.contextPath}/.resources/hello-magnolia/webresources/css/bootstrap.min.css" media="all" />
      <link rel="stylesheet" type="text/css" href="${ctx.contextPath}/.resources/hello-magnolia/webresources/css/custom-style.css" media="all" />
   </head>
   <body>
      <div class="container">
        <div class="main">
        [@cms.area name="main"/]
         </div>
      </div>
      <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
      <!-- Include all compiled plugins (below), or include individual files as needed -->
   </body>
</html>