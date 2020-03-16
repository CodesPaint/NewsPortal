<%
    String url = request.getRequestURI();
    request.setAttribute("url", url);
    %>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">Amaya</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item ${url.contains("index.jsp")?" active":""}">
              <a class="nav-link" href="index.jsp"><i class="fa fa-home"></i> &nbsp;Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
              <a class="nav-link ${url.contains("about.jsp")?" active":""}" href="about.jsp"><i class="fa fa-info-circle" aria-hidden="true"></i> &nbsp;About</a>
          </li>
          <li class="nav-item">
              <a class="nav-link ${url.contains("service.jsp")?" active":""}" href="service.jsp"><i class="fa fa-fire"></i> &nbsp;Services</a>
          </li>
          <li class="nav-item">
            <a class="nav-link ${url.contains("contactus.jsp")?" active":""}" href="contactus.jsp"><i class="fa fa-paper-plane"></i> &nbsp;Contact Us</a>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="login.jsp"><i class="fa fa-sign-in"></i> &nbsp;Login</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>