<%@ page pageEncoding="UTF-8" %>

<jsp:include page="/views/partials/header.jsp" />


<style type="text/css">
  body {
    padding-top: 40px;
    padding-bottom: 40px;
    background-color: #f5f5f5;
  }

  .form-signin {
    max-width: 300px;
    padding: 19px 29px 29px;
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

</style>

<div class="container">
  <div class="${ style }">${ message }</div>
  <form method="POST" class="form-signin" action="/ServletUsers">
    <h2 class="form-signin-heading">Connexion</h2>
    <input name="email" type="email" class="input-block-level" placeholder="Adresse email">
    <input name="password" type="password" class="input-block-level" placeholder="Mot de passe">
    <label class="checkbox">
      <input type="checkbox" value="remember-me"> Remember me
    </label>
    <label>Pas de compte! créez-en <a href="signinUser.jsp">ici</a></label>
    <button class="btn btn-large btn-primary" type="submit">Connexion</button>
  </form>

</div>

<jsp:include page="/views/partials/footer.jsp" />