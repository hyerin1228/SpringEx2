<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta name="google-signin-client_id" content="410261838086-fhdb73jj1fh87dvkffdmm91hqp6oe5ct.apps.googleusercontent.com">
	<title>Hello</title>
	<script src="https://apis.google.com/js/platform.js" async defer></script>
</head>
<body>
<h1>
	callback  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<div class="g-signin2" data-onsuccess="onSignIn"></div>
    <script>
        function onSignIn(googleUser) {
            // Useful data for your client-side scripts:
            var profile = googleUser.getBasicProfile();
            console.log("ID: " + profile.getId()); // Don't send this directly to your server!
            console.log('Full Name: ' + profile.getName());
            console.log('Given Name: ' + profile.getGivenName());
            console.log('Family Name: ' + profile.getFamilyName());
            console.log("Image URL: " + profile.getImageUrl());
            console.log("Email: " + profile.getEmail());

            // The ID token you need to pass to your backend:
            var id_token = googleUser.getAuthResponse().id_token;
            console.log("ID Token: " + id_token);
        };
    </script>
</body>
</html>
