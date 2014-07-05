<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Locking TreeGrid Example</title>
    <link rel="stylesheet" type="text/css" href="../example.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/scripts/extjs/include-ext.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/scripts/extjs/options-toolbar.js"></script>
    <script type="text/javascript" src="locking-treegrid.js"></script>
    <style type="text/css">
        .task {
                background-image: url(../icons/fam/cog.gif) !important;
        }
        .task-folder {
                background-image: url(../icons/fam/folder_go.gif) !important;
         }
    </style>
  </head>
  <body>
        <h1>
            Locking TreeGrid Example
        </h1>
        <p>
            This example is an advanced tree example. It illustrates:
        </p>
        <ul class="feature-list">
            <li>Locked columns
            </li>
            <li>Multiple headers
            </li>
            <li>Preloading of nodes with a single AJAX request
            </li>
            <li>Header hiding, showing, reordering and resizing
            </li>
            <li>useArrows configuration
            </li>
            <li>Keyboard Navigation
            </li>
            <li>Discontiguous selection by holding the CTRL key
            </li>
            <li>Using custom iconCls
            </li>
            <li>Animation disabled because the right side is a normal grid (which does not animate record insertion).
            </li>
        </ul>
        <p>
            Note that the js is not minified so it is readable. See <a href="locking-treegrid.js">locking-treegrid.js</a>.
        </p>
        <div id="tree-example"></div>
  </body>
</html>
