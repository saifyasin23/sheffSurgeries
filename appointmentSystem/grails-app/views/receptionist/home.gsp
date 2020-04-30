<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Controllers</title>
    <asset:stylesheet src="home.css" />
</head>
<body>

<div id="content" role="main">

<div class="row">

<div class="first">

<h3>Add Patient</h3>

<p> Button to add a patient to the System </p>

<button type="button" class="btn btn-success">

<g:link controller="patient" action="create">Add Patient</g:link>

</button>

</div>

<div class="second">

<h3>Add Nurse</h3>

<p> Button to add a Nurse to the system</p>

<button type="button" class="btn btn-success">

<g:link controller="nurse" action="create">Add Nurse</g:link>

</button>

</div>

<div class="third">

<h3>Add Doctor</h3>

<p> Button to add a doctor to the System </p>

<button type="button" class="btn btn-success">

<g:link controller="doctor" action="create">Add doctor</g:link>

</button>

</div>

<div class="forth">

<h3>Add Receptionist</h3>

<p> Button to add a receptionist to the System </p>

<button type="button" class="btn btn-success">

<g:link controller="receptionist" action="create">Add Receptionist</g:link>

</button>

</div>


</div>

</div>

</body>

</html>
