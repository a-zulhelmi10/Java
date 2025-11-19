<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
		integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Document</title>
    <style>
		body {
			background-image: url('cover.jpg');
            background-size: cover;
            background-attachment: fixed;
		}

		h1 {
			color: tomato;
		}
	</style>
</head>
<body>
    <img src="cover.jpg" style="width: 100%;"/>
   <div class="container mt-3">
        <h1> Hello, ${name}</h1>
   </div>
</body>
</html>