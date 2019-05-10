<%@ page language="java"  contentType="textml; charset=UTF-8" %>

<html lang="en" class="no-js">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>login</title>
        <link rel="stylesheet" type="text/css" href="css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <!--必要样式-->
        <link rel="stylesheet" type="text/css" href="css/component.css" />
        <!--[if IE]>
        <script src="js/html5.js"></script>
        <![endif]-->
    </head>
    <body>
        <div class="container demo-1">
            <div class="content">
                <div id="large-header" class="large-header">
                    <canvas id="demo-canvas"></canvas>
                    <div class="logo_box">
                        <h3>欢迎你</h3>
                        <form action="user/login.do" name="f" method="post">
                            <div class="input_outer">
                                <span class="u_user"></span>
                                <input name="username" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
                            </div>
                            <div class="input_outer">
                                <span class="us_uer"></span>
                                <input type="submit" name="submit1" value="登陆" />
                                <input name="password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
                            </div>
                            <div class="mb2"><input class="submit" /></div>
                        </form>
                    </div>
                </div>
            </div>
        </div><!-- /container -->
        <script src="js/TweenLite.min.js"></script>
        <script src="js/EasePack.min.js"></script>
        <script src="js/rAF.js"></script>
        <script src="js/demo-1.js"></script>
        <div style="text-align:center;">
            <p>更多模板：<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
        </div>
    </body>
</html>