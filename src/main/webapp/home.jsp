<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="home.css">
    <title>Chat Room</title>
</head>

<body>
    <div id="chat">
        <div id="chat-messages"></div>
        <form id="chat-form">
            <input type="text" name="message" placeholder="Enter a message..." maxlength="500" autocomplete="on">
            <button type="submit">Send</button>
        </form>
    </div>
</body>

    <script src="home.js"></script>

</html>

