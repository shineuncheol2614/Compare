<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Compare</title>
<style>
.sticky {
	position: fixed;
	top: 0;
	left: 0;
	rignt: 0;
	width: 100;
}

.sticky+.sidenav {
	padding-top: 102px;
}

.sidenav {
	height: 100%; /* Full-height: remove this if you want "auto" height */
	width: 160px; /* Set the width of the sidebar */
	position: fixed; /* Fixed Sidebar (stay in place on scroll) */
	z-index: 0; /* Stay on top */
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
	.sidenav {
		padding-top: 15px;
	}
	.sidenav a {
		font-size: 18px;
	}
}
</style>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">


<style>
#str {
	position: absolute;
	left: 200px
}
</style>

</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#"><h4>
				<b>Compare</b>
			</h4></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item">
					<div class="nav-link">
						<h3>
							기준 환율 :
							<c:out value="${krw.krw}" />
						</h3>
					</div>
				</li>

				<li class="nav-item">
					<div class="nav-link">컴퓨터소프트웨어공학과 신은철</div>
				</li>
				<li class="nav-item">
					<div class="nav-link">정보통신공학과 이건우</div>
				</li>
				<li class="nav-item">
					<div class="nav-link">기계공학과 정지연</div>
				</li>
				<li class="nav-item">
					<div class="nav-link">전자공학과 황지석</div>
				</li>
				<li class="nav-item dropdown">
					<div class="nav-link dropdown-toggle" id="navbarDropdownMenuLink"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">Compare Team</div>
				</li>
			</ul>
		</div>
	</nav>


<div class="sidenav">
	<a href="http://localhost:8080/compare/main">Samsung</a>
	<a href="http://localhost:8080/compare/apple">Apple</a>
	<a href="http://localhost:8080/compare/nokia">Nokia</a>
	<a href="http://localhost:8080/compare/bookmark">Bookmark</a>
	<a href="http://localhost:8080/compare/exchange">Exchange</a>
</div>

	<div class="container" id="str">
		<h1>Recommend Items</h1>
		<p class="explain">How about this items!</p>
		<hr class="my-4">

		<div class="container">
			<div class="row">
				<div class="col-lg-4">
					<div class="card" style="width: 15rem;">
						<div class="card text-black bg-white">
							<img
								src="https://m.media-amazon.com/images/I/81Wgm0f4phL._AC_UL320_.jpg"
								class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">IPhone12 Pro Max</h5>
								<a
									href="https://www.amazon.com/s?k=iphone+12+pro&ref=nb_sb_noss_2"
									class="btn btn-primary">Go Item Page</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="card" style="width: 15rem;">
						<div class="card text-black bg-white">
							<img	
								src="https://images-na.ssl-images-amazon.com/images/I/71C4k%2BEj67L._AC_SX425_.jpg"
								class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">Samsung S20+</h5>
								<a href="https://www.amazon.com/s?k=samsung+s20%2B&ref=nb_sb_noss_2" class="btn btn-primary">Go
									Item Page</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="card" style="width: 15rem;">
						<div class="card text-black bg-white">
							<img
								src="https://m.media-amazon.com/images/I/61A+K1MjTeL._AC_UY218_.jpg"
								class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">Computer</h5>
								<a href="https://www.amazon.com/s?k=computer&ref=nb_sb_noss_2" class="btn btn-primary">Go
									Item Page</a>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-4">
					<div class="card" style="width: 15rem; top: 50px;">
						<div class="card text-black bg-white">
							<img
								src="https://m.media-amazon.com/images/I/71rw+F2aLHL._AC_UY218_.jpg"
								class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">GalaxyTab S7</h5>
								<a href="https://www.amazon.com/s?k=galaxy+tab+s7&crid=2V0TQHJMNA05O&sprefix=galaxy+tab+s%2Caps%2C-1&ref=nb_sb_noss_2" class="btn btn-primary">Go
									Item Page</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="card" style="width: 15rem; top: 50px;">
						<div class="card text-black bg-white">
							<img
								src="https://m.media-amazon.com/images/I/71XWG48C-NL._AC_UY218_.jpg"
								class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">Smart Watch</h5>
								<a href="https://www.amazon.com/s?k=samsung+smart+watch&ref=nb_sb_noss" class="btn btn-primary">Go
									Item Page</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="card" style="width: 15rem; top: 50px;">
						<div class="card text-black bg-white">
							<img
								src="https://m.media-amazon.com/images/I/619BkvKW35L._AC_UY218_.jpg"
								class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">PlayStation5</h5>
								<a href="https://www.amazon.com/s?k=play+station5&ref=nb_sb_noss" class="btn btn-primary">Go
									Item Page</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>







