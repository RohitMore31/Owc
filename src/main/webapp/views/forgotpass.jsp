<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Owc</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Asap+Condensed&family=Caveat&family=Crete+Round&family=DynaPuff&family=Josefin+Sans:wght@100;300&family=Kalam:wght@300&family=Kanit:wght@300&family=Lobster&family=Lobster+Two&family=Orbitron&family=Roboto+Slab&family=Rubik+Burned&display=swap"
      rel="stylesheet"
    />
    <script>
        // let 
    </script>
    <style>
      .signin {
            font-family: "Times New Roman", Times, serif;
            text-align: center;
            width: 70vw;
            margin: 2vh auto;
          }
    </style>
</head>
<body>
    <div class='signin'>
        <section class="vh-75 " style="background-color: #eee">
          <div class="container h-75">
            <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">
             <p class="text-center h1 fw-bold mb-4">Reset Password</p>
              <!-- <form method="post" action="http://localhost:5000/Reset/resetpassword"> -->
                <form method="post" action="http://localhost:8080/Reset/updatepassword">
                <div class="form-outline mb-4">
                  <input type="email" id="email" name="email" class="form-control" value=${id} readonly />
                </div>
      
                <div class="form-outline mb-4">
                  <input type="password" id="password" name="password" class="form-control" placeholder='Password' required/>
                </div>

                <div class="form-outline mb-4">
                    <input type="password" id="password" name="cmfpassword" class="form-control" placeholder='confirm password' required/>
                </div>
      
                <button type="submit" class="btn btn-primary btn-block mb-4">Reset Password</button>

              </form>
              </div>  
            </div>
          </section>
          <SignUp/>   
        </div> 
      
      
</body>
</html>