<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type"  content="text/html"; charset="utf-8" />
        <title>Inscription </title>
        <jsp:include page="/views/partials/header.jsp" />

    </head>
    <style type="text/css">
          body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #f5f5f5;
          }

          .form-signin {
            max-width: 500px;
            padding: 19px 29px 42px;
            margin: 0 auto 20px;
            background-color: #fff;
            border: 1px solid #e5e5e5;
            -webkit-border-radius: 5px;
               -moz-border-radius: 5px;
                    border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
               -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                    box-shadow: 0 1px 2px rgba(0,0,0,.05);
          }
          .form-signin .form-signin-heading,
          .form-signin .checkbox {
            margin-bottom: 10px;
          }
          .form-signin input[type="text"],
          .form-signin input[type="password"] {
            font-size: 16px;
            height: auto;
            margin-bottom: 15px;
            padding: 7px 9px;
          }
        .form-bottom {
            width: 200px;
            float: right;
        }
    </style>
    <body>
        <div class="container">
            <form method="POST" action="/SignInUser" enctype="multipart/form-data" class="form-signin">

                <h3>Informations personnelles</h3>
                    
                <div class="${ style }">${ message }</div>

                <label for="username">Pseudo <span class="requis">*</span></label>
                <input type="text" id="username" name="username" value=""  class="input-block-level" required/>
                <br />

                <label for="lastname">Nom <span class="requis">*</span></label>
                <input type="text" id="lastname" name="lastname" value="" class="input-block-level" required/>
                <br />
                
                <label for="firstname">Prénom <span class="requis">*</span></label>
                <input type="text" id="firstname" name="firstname" value=""  class="input-block-level" required/>
                <br />

                <label for="password">Mot de passe <span class="requis">*</span></label>
                <input type="password" id="password" name="password" value="" class="input-block-level" required/>
                <br />

                <label for="passwordConfirm">Confirmation du mot de passe <span class="requis">*</span></label>
                <input type="password" id="passwordConfirm" name="passwordConfirm" value="" class="input-block-level" required/>
                <br />
                
                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="email" id="email" name="email" value="" class="input-block-level" required/>
                <br />

                <label for="avatar"> Avatar </label>
                <input type="file" id="avatar" name="avatar" value="" class="input-block-level"/>
                <br /><br />

                <div class="form-bottom">
                    <button type="submit" class="btn btn-success">Valider</button>
                    <button type="reset" class="btn btn-danger">Remettre à zéro </button><br />
                </div>
            </form>
        </div>
    </body>
</html>