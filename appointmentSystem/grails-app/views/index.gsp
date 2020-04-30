<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Appointment System</title>
</head>
<body>

<div class="row">

 <asset:image src="doctors.jpg"/>

 </div>


<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome to an appointment system</h1>

        <p>
            Welcome to saif yasins appointment system. If you are a receptionist or a doctor you can log in 			through the log in on the side of the page.






        <div id="controllers" role="navigation">
            <h2>Available Controllers for testing:</h2>
            <ul>
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <li class="controller">
                        <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                    </li>
                </g:each>
            </ul>
        </div>
    </section>
</div>

</body>
</html>
