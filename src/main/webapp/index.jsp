<%-- 
    Document   : listComposers
    Created on : 13/02/2018, 10:20:23 AM
    Author     : LabingXEON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!--
        Stellar by HTML5 UP
        html5up.net | @ajlkn
        Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
    <head>
        <title>Stellar by HTML5 UP</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" href="assets/css/main.css" />
        <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
    </head>
    <body >
        <!-- Wrapper -->
        <div id="wrapper">

            <!-- Header -->
            <header id="header" class="alt">
                <span class="logo"><img src="images/logo.svg" alt="" /></span>
                <h1>Composers</h1>
                <p>Update list by AJAX calls</p>
            </header>



            <!-- Main -->
            <div id="main">

                <!-- Introduction -->
                <section id="intro" class="main">
                    <div class="spotlight">
                        <div class="content">
                            <form name="autofillform" action="autocomplete">
                            <header class="major">
                                <h2>Composers list </h2> 
                            </header>
                            <p><a onclick="doList();" class="button special small">Update table</a></p>
                            

                                <div>
                                    <table>
                                        <thead>
                                            <tr>
                                                <th>ID</th>
                                                <th>First Name</th>
                                                <th>Last Name</th>
                                                <th>Category</th>
                                            </tr>
                                        </thead>
                                        <tbody id="mitabla">
                                        </tbody>
                                    </table>
                                </div>

                                
                            </form>
                        </div>
                    </div>
                </section>
            </div>
        </div>

        
        
        <!-- Scripts -->
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/jquery.scrollex.min.js"></script>
        <script src="assets/js/jquery.scrolly.min.js"></script>
        <script src="assets/js/skel.min.js"></script>
        <script src="assets/js/util.js"></script>
        <script src="assets/js/js1.js"></script>
        <!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
        <script src="assets/js/main.js"></script>

    </body>
</html>