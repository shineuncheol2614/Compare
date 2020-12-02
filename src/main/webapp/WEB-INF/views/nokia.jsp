<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="ko">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Compare</title>
<style>
.sidenav {
  height: 100%; /* Full-height: remove this if you want "auto" height */
  width: 160px; /* Set the width of the sidebar */
  position: fixed; /* Fixed Sidebar (stay in place on scroll) */
  z-index: 1; /* Stay on top */
  top: 50; /* Stay at the top */
  left: 0;
  background-color: #111; /* Black */
  overflow-x: hidden; /* Disable horizontal scroll */
  padding-top: 20px;
}

/* The navigation menu links */
.sidenav a {
  padding: 6px 8px 6px 16px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
}

/* When you mouse over the navigation links, change their color */
.sidenav a:hover {
  color: #f1f1f1;
}

/* Style page content */
.main {
  margin-left: 160px; /* Same as the width of the sidebar */
  padding: 0px 10px;
}

/* On smaller screens, where height is less than 450px, change the style of the sidebar (less padding and a smaller font size) */
@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
</style>
<link rel="stylesheet"
   href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#"><h4><b>Compare</b></h4></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item">
        <div class="nav-link"><h3>기준 환율 : <c:out value = "${krw.krw}"/></h3></div>
      </li>
      
            <li class="nav-item">
        <div class="nav-link">컴퓨터소프트웨어공학과 신은철</div>
      </li>
                  <li class="nav-item">
        <div class="nav-link">정보통신공학과 이우석</div>
      </li>
                  <li class="nav-item">
        <div class="nav-link">기계공학과 정지연</div>
      </li>
                  <li class="nav-item">
        <div class="nav-link">전자공학과 황지석</div>
      </li>
      <li class="nav-item dropdown">
        <div class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Compare Team
        </a>
      </li>
    </ul>
  </div>
</nav>


<div class="sidenav">
  <a href="http://localhost:8080/compare/main">Samsung</a>
  <a href="http://localhost:8080/compare/apple">Apple</a>
  <a href="http://localhost:8080/compare/nokia">Nokia</a>
</div>
<c:forEach items="${amazon}" var = "amazon">

<div class="card mb-3" style="max-width: 700px; top : 50px; left : 200px">
  <div class="row no-gutters">
    <div class="col-md-4">
      <img src="${amazon.img }" class="card-img" width = "10px" height = "200px">
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title"><c:out value = "${amazon.productName}"/></h5>
        <p class="card-text"> Price : <c:out value = "${amazon.priceUsd}"/></p>
        <p class="card-text"><small class="text-muted"><a href = <c:out value = "${amazon.url}"/> target="_blank"> Go To Amazon And View Details </a></small></p>
      </div>
    </div>
  </div>
</div>
</c:forEach>


</body>
</html>