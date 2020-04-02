<!DOCTYPE html>
<html>


	<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

<style type="text/css">

		@import url('https://fonts.googleapis.com/css?family=Pinyon+Script&display=swap')


		*{
			margin: 0px;
			padding: 0px;
		}

		body{
         background: url(https://lh3.googleusercontent.com/proxy/f8urrOiRz9GLhIDhzH1mP--QtKkD8tfsnZTBD-ngbVYReOB1YEXimpy0kuDFgUBGFI8EWTG2e_ECx_9txJgLYVLFZlC6wuBV-_cLUoMjwJYlSzn0j-AeHPaE_08) #2b2b2a;
         background-position: center;

		}

		form{
			background:#FFFFFF26;
			width: 360px;
			border: 0px solid #4e4d4d;
			border-radius: 3PX;
			-MOZ-border-radius: 3PX;
			-Webkit-border-radius: 3PX;
			box-shadow: inset 0 0 10px #000;
			margin: 30px auto;			
		}

		form h2{
            text-align: center;
            color: #fff;
            font-weight: normal;
            font-size: 40pt;
            margin: 30px 0px
            font : 'Pinyon Script', cursive;
            font-family: 'Spicy Rice', cursive;
            	}
        form p{
            text-align: center;
            color: #fff;
            font-weight: normal;
            font-size: 12pt;
            
          
                     

		}

		form input{

			width: 280px;
			height: 35px;
			padding: 0px 10px;
			color: #160843;
			text-align: center;
			margin: 10px 30px;
			background-color: #3333333
		
		
			border: 0px;

		
	</style>



<head>
	<title>PRACTICA CLASS 02-04-2020</title>



</head>
<body>
 	

 	<form action="servletControler" method="post">
 	
 	<H2 align="center">AGREGAR DATOS</H2>

 	<TABLE align="center">
 		<thead>
 			


 		</thead>
 		<tbody align="center">
 			<tr align="center">
 				<td align="center">
 					
 <p>id</p><input type="tex" name="Id"  align="center">
 <p>Nombre Producto</p><input type="tex" name="Nproducto"  align="center">
 <p>Precio Producto</p><input type="tex" name="Pproducto"  align="center">
 <p>Cantidad Producto</p><input type="tex" name="Cproducto"  align="center">
 <p>Total de Producto</p><input type="tex" name="Tproducto"  align="center">
 <br>
 <br>
 
 						
 					
 				</td>
 			</tr>
 		</tbody>


 	</TABLE>

<input type="submit" name="btn" value="AGREGAR" >
<input type="submit" name="btn" value="ELIMINAR">
<input type="submit" name="btn" value="MODIFICAR">


 	</form>

</body>
</html>