<!DOCTYPE html>
<html>

	<head>
		<title>Tabela Latin-1 (ISO-8859-1)</title>

		<meta http-equiv="Content-type"
			  content="text/html; charset=iso8859-1" />


	</head>

	<body lang="pt-br">
		<h1>Tabela Latin-1 (ISO-8859-1)</h1>

		<table border="1">
			<tr>
				<th>decimal</th><th>hexadecimal</th><th>caractere</th>
			</tr>
			<!--corpo da tabela-->
			<?php
				for ($i=32; $i<256; $i++) {
					echo("<tr><td>");
					echo($i);
					echo("</td><td>");
					echo(dechex($i));
					echo("</td><td>");
					echo(chr($i));
					echo("</td></tr>");
				}
			?>
		</table>

	</body>

</html>

