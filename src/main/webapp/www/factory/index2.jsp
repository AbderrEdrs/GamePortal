<%@page import="sun.awt.AppContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="factoryfun.donnees.*"%>
<!DOCTYPE html>
<html>
	<head>
	  <meta charset="utf-8">
	  <title>FactoryFun</title>
	  <link rel="stylesheet" type="text/css" href="/assets/factory/css/style3.css">
	</head>
	<body>
		<table id="structure">
			<tbody>
				<tr>
					<td style="width : 1%;">
						<table>
							<tbody>
								<tr>
									<td>
										<div style="width : 400px; height : 282px; background : url('/assets/factory/img/scoreboard.png'); background-size : 400px; background-repeat : no-repeat;"></div>
									</td>
								</tr>
							</tbody>
						</table>
					</td>
					<td style="text-align : center;">
						<table style="display : inline-block;">
							<tbody>
								<tr>
									<td>
										<div style="height : 630px; width : 778px; background-image : url('/assets/factory/img/plateau.png'); background-size : 100%;">
											<div id="plateau" style="position : relative; left : 12px; top : 15px; width : 750px; height : 600px;"></div>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
					</td>
					<td style="width : 20%;">
						<table style="width : 100%; height : 100%;">
							<tbody>
								<tr>
									<td id="machines" style="height : 25%; vertical-align : top;">
									</td>
								</tr>
								<tr>
									<td style="height : 25%;">
									</td>
								</tr>
								<tr>
									<td style="height : 25%;">
									</td>
								</tr>
								<tr>
									<td style="height : 25%;">
									</td>
								</tr>
							</tbody>
						</table>
					</td>
				</tr>
			</tbody>
		</table>
		<script type="text/javascript">
			var i;
			var j;
			var plateau = [];
			var cmd_pressed = {};
			
			/***********************************************************************************************************************/
			/********************PARAMETRES******************PARAMETRES*************************PARAMETRES**************************/
			/***********************************************************************************************************************/
			var colonnes = 8;
			var lignes = 10;
			var taille_composant = 75;
			
			function asset(src)
			{
				return '/assets/factory/img/' + src;
			}
			/***********************************************************************************************************************/
			/********************PARAMETRES******************PARAMETRES*************************PARAMETRES**************************/
			/***********************************************************************************************************************/
			
			/***********************************************************************************************************************/
			/**************FONCTIONS CALCUL**************FONCTIONS CALCUL*********************FONCTIONS CALCUL**********************/
			/***********************************************************************************************************************/
			function toInt(element)
			{
				return parseInt(element.substring(0, element.length - 2));
			}
			
			function coordonnees(element)
			{
				var position = element;
												
				var left = position.offsetLeft + toInt(getComputedStyle(position, null).borderLeftWidth);
				var top = position.offsetTop + toInt(getComputedStyle(position, null).borderTopWidth);
				
				while(position = position.offsetParent)
				{
					left += position.offsetLeft + toInt(getComputedStyle(position, null).borderLeftWidth);
					top += position.offsetTop + toInt(getComputedStyle(position, null).borderTopWidth);
				}
				
				return {left : left, top : top};
			};
			/***********************************************************************************************************************/
			/**************FONCTIONS CALCUL**************FONCTIONS CALCUL*********************FONCTIONS CALCUL**********************/
			/***********************************************************************************************************************/
			
			/***********************************************************************************************************************/
			/**************FONCTIONS MACHINE**************FONCTIONS MACHINE********************FONCTIONS MACHINE********************/
			/***********************************************************************************************************************/
			function generateMachine(name)
			{
				var machine = document.createElement('img');
				machine.src = asset(name + '.png');
				machine.style.height = taille_composant + 'px';
				machine.style.width = (taille_composant * 2) + 'px';

				document.querySelector('#machines').appendChild(machine);
				
				machine.addEventListener('mousedown',
				{
					handleEvent :	function(e)
									{
										if (e.button == 0)
										{
											e.preventDefault();
											
											var div = e.target;
							
											var c = coordonnees(div);
											div.style.width = toInt(getComputedStyle(div).width) + 'px';
											div.style.left = c.left + 'px';							
											div.style.top = c.top + 'px';
											div.style.position = 'absolute';
											div.style.zIndex = '1';
								
											cmd_pressed.div = div;
											cmd_pressed.dx = e.clientX - c.left;											
											cmd_pressed.dy = e.clientY - c.top;
											cmd_pressed.name = this.name;
											div.style.cursor = '-webkit-grabbing';
											document.body.style.cursor = '-webkit-grabbing';
								
											div.style.pointerEvents = 'none';
										}
									},
					name : name
				},
				false);
			}
			/***********************************************************************************************************************/
			/**************FONCTIONS MACHINE**************FONCTIONS MACHINE********************FONCTIONS MACHINE********************/
			/***********************************************************************************************************************/
			
			/***********************************************************************************************************************/
			/*******************EVENEMENTS*********************EVENEMENTS*************************EVENEMENTS************************/
			/***********************************************************************************************************************/
			var cmd_mousemove =	function(e)
								{
									if (cmd_pressed.div)
									{
										cmd_pressed.div.style.top = (e.clientY - cmd_pressed.dy) + 'px';
										cmd_pressed.div.style.left = (e.clientX - cmd_pressed.dx) + 'px';
									}
								};
													
			var cmd_mouseup =	function(e)
								{
									document.body.style.cursor = '';

									/********************/
									generateMachine('multi-fitter');
									/********************/
								};
			/***********************************************************************************************************************/
			/*******************EVENEMENTS*********************EVENEMENTS*************************EVENEMENTS************************/
			/***********************************************************************************************************************/
			
			/***********************************************************************************************************************/
			/************INITIALISATION COMPOSANTS***********INITIALISATION COMPOSANTS***********INITIALISATION COMPOSANTS**********/
			/***********************************************************************************************************************/
			generateMachine('multi-fitter');
			/***********************************************************************************************************************/
			/************INITIALISATION COMPOSANTS***********INITIALISATION COMPOSANTS***********INITIALISATION COMPOSANTS**********/
			/***********************************************************************************************************************/

			/***********************************************************************************************************************/
			/************INITIALISATION PLATEAU*************INITIALISATION PLATEAU****************INITIALISATION PLATEAU************/
			/***********************************************************************************************************************/
			var div_plateau = document.querySelector('#plateau');
			
			for (i = 0; i < colonnes; i++)
			{
				plateau.push([]);
				
				for (j = 0; j < lignes; j++)
				{
					if (!(j == 9 && (i == 6 || i == 7)))
					{
						var composant = {x : j * taille_composant, y : i * taille_composant, div : null};
						plateau[i].push(composant);
						
						var div = document.createElement('div');
						div.setAttribute('style', 'position : absolute; background-color : rgba(255, 255, 255, 0.7); width : ' + taille_composant + 'px; height : ' + taille_composant + 'px; left : ' + (j * taille_composant) + 'px; top : ' + (i * taille_composant) + 'px;"');
										
						div.addEventListener('mouseup',
						{
							handleEvent :	function(e)
											{
												document.body.removeAttribute('style');

												div_plateau.appendChild(cmd_pressed.div);
												cmd_pressed.div.style.left = plateau[this.i][this.j].x + 'px';
												cmd_pressed.div.style.top = plateau[this.i][this.j].y + 'px';

												cmd_pressed.div = null;
											},
							i : i,
							j : j
						},
						false);
						
						div_plateau.appendChild(div);
					}
				}
			}
			/***********************************************************************************************************************/
			/************INITIALISATION PLATEAU*************INITIALISATION PLATEAU****************INITIALISATION PLATEAU************/
			/***********************************************************************************************************************/

			/***********************************************************************************************************************/
			/*****************EVENEMENTS WINDOW****************EVENEMENTS WINDOW******************EVENEMENTS WINDOW*****************/
			/***********************************************************************************************************************/
			const LEFT = 37;
			const UP = 38;
			const RIGHT = 39;
			const DOWN = 40;

			window.onmousemove =	function(e)
									{
										cmd_mousemove(e);
									};
														
			window.onmouseup =	function(e)
								{	
									cmd_mouseup();
								};

			window.onkeydown =	function(e)
								{
									if (cmd_pressed.div)
									{
										var key = e.keyCode;

										if (key == LEFT)
										{
											cmd_pressed.div.src = asset(cmd_pressed.name + '_left.png');
											cmd_pressed.div.style.width = (taille_composant * 2) + 'px';
											cmd_pressed.div.style.height = taille_composant + 'px';
										}
										else if (key == UP)
										{
											cmd_pressed.div.src = asset(cmd_pressed.name + '_up.png');
											cmd_pressed.div.style.width = taille_composant + 'px';
											cmd_pressed.div.style.height = (taille_composant * 2) + 'px';											
										}
										else if (key == RIGHT)
										{
											cmd_pressed.div.src = asset(cmd_pressed.name + '.png');
											cmd_pressed.div.style.width = (taille_composant * 2) + 'px';
											cmd_pressed.div.style.height = taille_composant + 'px';
										}
										else if (key == DOWN)
										{
											cmd_pressed.div.src = asset(cmd_pressed.name + '_down.png');
											cmd_pressed.div.style.width = taille_composant + 'px';
											cmd_pressed.div.style.height = (taille_composant * 2) + 'px';
										}
									}
								};
			/***********************************************************************************************************************/
			/*****************EVENEMENTS WINDOW****************EVENEMENTS WINDOW******************EVENEMENTS WINDOW*****************/
			/***********************************************************************************************************************/
		</script>
	</body>
</html>