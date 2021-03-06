const MACHINE = 'machine';
const RESERVOIR = 'reservoir';
const CONTAINER = 'container';
const CONNECTOR = 'connector';

const LEFT_SIDE = 'left';
const RIGHT_SIDE = 'right';
const TOP_SIDE = 'top';
const BOTTOM_SIDE = 'bottom';

var i;
var j;
var plateau = [];
var scoreboard = [];
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

function coordonnees2(element)
{
	var position = element;
									
	var left = position.offsetLeft + toInt(getComputedStyle(position, null).borderLeftWidth);
	var top = position.offsetTop + toInt(getComputedStyle(position, null).borderTopWidth);
	
	while(position = position.offsetParent)
	{
		left += position.offsetLeft + toInt(getComputedStyle(position, null).borderLeftWidth);
		top += position.offsetTop + toInt(getComputedStyle(position, null).borderTopWidth);
	}
	return {left : left - 615, top : top - 76};
};
/***********************************************************************************************************************/
/**************FONCTIONS CALCUL**************FONCTIONS CALCUL*********************FONCTIONS CALCUL**********************/
/***********************************************************************************************************************/

/***********************************************************************************************************************/
/**************FONCTIONS MACHINE**************FONCTIONS MACHINE********************FONCTIONS MACHINE********************/
/***********************************************************************************************************************/
var mousedown_component =	function(e)
							{
								if (e.button == 0)
								{
									e.preventDefault();
									
									var div = e.target;
								
									var c;
									if (this.down == 'first')
									{
										c = coordonnees(div);
										this.down = 'second';
									}
									else
										c = coordonnees2(div);
									div.style.width = toInt(getComputedStyle(div).width) + 'px';
									div.style.left = c.left + 'px';							
									div.style.top = c.top + 'px';
									div.style.position = 'absolute';
									div.style.zIndex = '1';
								
									cmd_pressed.div = div;
									cmd_pressed.dx = e.clientX - c.left;											
									cmd_pressed.dy = e.clientY - c.top;
									cmd_pressed.name = this.name;
									cmd_pressed.direction = RIGHT_SIDE;
									cmd_pressed.type = this.type;
									div.style.cursor = '-webkit-grabbing';
									document.body.style.cursor = '-webkit-grabbing';
								
									div.style.pointerEvents = 'none';
								}
							};

function generateMachine(name)
{
	var machine = document.createElement('img');
	machine.src = asset(name + '.png');
	machine.style.height = taille_composant + 'px';
	machine.style.width = (taille_composant * 2) + 'px';

	document.querySelector('#machines').appendChild(machine);
	
	machine.addEventListener('mousedown',
	{
		handleEvent : mousedown_component,
		name : name,
		type : MACHINE,
		down : 'first'
	},
	false);
}

function generateReservoir(name)
{
	var reservoir = document.createElement('img');
	reservoir.src = asset(name + '.png');
	reservoir.style.height = taille_composant + 'px';
	reservoir.style.width = taille_composant + 'px';

	document.querySelector('#reservoirs').appendChild(reservoir);
	
	reservoir.addEventListener('mousedown',
	{
		handleEvent : mousedown_component,
		name : name,
		type : RESERVOIR,
		down : 'first'
	},
	false);
}

function generateContainer(name)
{
	var container = document.createElement('img');
	container.src = asset(name + '.png');
	container.style.height = taille_composant + 'px';
	container.style.width = taille_composant + 'px';

	document.querySelector('#containers').appendChild(container);
	
	container.addEventListener('mousedown',
	{
		handleEvent : mousedown_component,
		name : name,
		type : CONTAINER,
		down : 'first'
	},
	false);
}

function generateContainer2(name)
{
	var container = document.createElement('img');
	container.src = asset(name + '.png');
	container.style.height = taille_composant + 'px';
	container.style.width = taille_composant + 'px';

	var td = document.createElement('td');
	td.appendChild(container);
	document.querySelector('#containers2 tbody tr').appendChild(td);
	
	container.addEventListener('mousedown',
	{
		handleEvent : mousedown_component,
		name : name,
		type : CONTAINER,
		down : 'first'
	},
	false);
}

function generateConnector(name)
{
	var connector = document.createElement('img');
	connector.src = asset(name + '.png');
	connector.style.height = taille_composant + 'px';
	connector.style.width = taille_composant + 'px';

	var td = document.createElement('td');
	td.appendChild(connector);
	document.querySelector('#connectors tbody tr').appendChild(td);
	
	connector.addEventListener('mousedown',
	{
		handleEvent : mousedown_component,
		name : name,
		type : CONNECTOR,
		down : 'first'
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
						//generateMachine('multi-fitter');
						/********************/
					};
/***********************************************************************************************************************/
/*******************EVENEMENTS*********************EVENEMENTS*************************EVENEMENTS************************/
/***********************************************************************************************************************/

/***********************************************************************************************************************/
/************INITIALISATION COMPOSANTS***********INITIALISATION COMPOSANTS***********INITIALISATION COMPOSANTS**********/
/***********************************************************************************************************************/
					/**************************************************************************/
					var xhr = new XMLHttpRequest;

					xhr.onreadystatechange =	function(e)
												{
													if (xhr.readyState == 4 && xhr.status == 200)
													{
														/*var ok = JSON.parse(xhr.responseText);
														
														alert(ok.name);*/
														generateMachine(xhr.responseText);
													}
												};

					xhr.open('GET', '/factoryfun/extractmachine');
					xhr.send(null);
					/**************************************************************************/
/*generateMachine('multi-fitter');
generateMachine('maximixer');
generateMachine('cwality_06');
generateMachine('flexfixer');
generateMachine('reactor_4.6');
generateMachine('supershaker');
generateMachine('pack-o-matic');*/
generateReservoir('reservoir');
generateReservoir('reservoir');
generateReservoir('reservoir_black');
/*generateMachine('minifreezer');
generateMachine('holl_boxer');
generateMachine('megabrowner');
generateMachine('magnetizer');
generateMachine('superseal');
generateMachine('minimega');
generateMachine('minigiga-bot');
generateMachine('verdamp_2.1');*/
//generateMachine('minimizer');
generateContainer('container_red');
generateContainer('container_blue');
generateContainer('container_green');
generateContainer('container_orange');
generateConnector('connector_simple');
generateConnector('connector_curved');
generateConnector('connector_cross');
generateConnector('connector_cross_plain');
generateConnector('connector_twist');
generateContainer2('container_red');
generateContainer2('container_blue');
generateContainer2('container_green');
generateContainer2('container_orange');
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

									//if (cmd_pressed.type == MACHINE)
									
									/**************************************************************************/
									var xhr = new XMLHttpRequest;

									xhr.onreadystatechange =	function(e)
																{
																	if (xhr.readyState == 4 && xhr.status == 200)
																	{
																		document.querySelector('#description_composant').textContent = xhr.responseText;
																		/*var ok = JSON.parse(xhr.responseText);
																		
																		alert(ok.name);*/
																		//alert(xhr.responseText);
																	}
																};

									xhr.open('POST', '/factoryfun/action');
									xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
									xhr.send('name=' + cmd_pressed.name + '&type=' + cmd_pressed.type + '&x=' + this.j + '&y=' + this.i + '&direction=' + cmd_pressed.direction);
									/**************************************************************************/
									
									/*******evenement pour le composant cr���� en cas de redeplacement ***********/
									var div_tmp = cmd_pressed.div;
									
									cmd_pressed.div = null;
									
									div_tmp.style.pointerEvents = 'auto';
									div_tmp.removeEventListener('mousedown', arguments.callee, false);
									
									/*div_tmp.addEventListener('mousedown',
									{
										handleEvent :	function(e)
														{
															alert('okkk');
															/*if (e.button == 0)
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
																cmd_pressed.type = MACHINE;
																cmd_pressed.direction = RIGHT_SIDE;
																div.style.cursor = '-webkit-grabbing';
																document.body.style.cursor = '-webkit-grabbing';
													
																div.style.pointerEvents = 'none';
															}
														}
									},
									false);*/
									/*******evenement pour le composant cr���� en cas de redeplacement ***********/
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
/***********INITIALISATION SCOREBOARD**********INITIALISATION SCOREBOARD*************INITIALISATION SCOREBOARD**********/
/***********************************************************************************************************************/
var div_scoreboard = document.querySelector('#scoreboard');
var score = document.querySelector('#score');
var score_level = 2;

function setScoreLevel(level)
{
	score.style.left = scoreboard[level - 1].x + 'px';
	score.style.top = scoreboard[level - 1].y + 'px';
}

for (i = 0; i < 7; i++)
{	
	for (j = 0; j < 15; j++)
	{
		scoreboard.push({x : j * 25, y : i * 25});
		
		var div = document.createElement('div');
		div.setAttribute('style', 'position : absolute; width : ' + 25 + 'px; height : ' + 25 + 'px; left : ' + (j * 25) + 'px; top : ' + (i * 25) + 'px;"');
		
		div_scoreboard.appendChild(div);
	}
}

setScoreLevel(score_level);
/***********************************************************************************************************************/
/***********INITIALISATION SCOREBOARD**********INITIALISATION SCOREBOARD*************INITIALISATION SCOREBOARD**********/
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
							var u_width = (cmd_pressed.type == MACHINE) ? 2 : 1;
							
							if (key == LEFT)
							{
								cmd_pressed.div.src = asset(cmd_pressed.name + '_left.png');
								cmd_pressed.div.style.width = (taille_composant * u_width) + 'px';
								cmd_pressed.div.style.height = taille_composant + 'px';
								cmd_pressed.direction = LEFT_SIDE;
							}
							else if (key == UP)
							{
								cmd_pressed.div.src = asset(cmd_pressed.name + '_up.png');
								cmd_pressed.div.style.width = taille_composant + 'px';
								cmd_pressed.div.style.height = (taille_composant * u_width) + 'px';
								cmd_pressed.direction = TOP_SIDE;
							}
							else if (key == RIGHT)
							{
								cmd_pressed.div.src = asset(cmd_pressed.name + '.png');
								cmd_pressed.div.style.width = (taille_composant * u_width) + 'px';
								cmd_pressed.div.style.height = taille_composant + 'px';
								cmd_pressed.direction = RIGHT_SIDE;
							}
							else if (key == DOWN)
							{
								cmd_pressed.div.src = asset(cmd_pressed.name + '_down.png');
								cmd_pressed.div.style.width = taille_composant + 'px';
								cmd_pressed.div.style.height = (taille_composant * u_width) + 'px';
								cmd_pressed.direction = BOTTOM_SIDE;
							}
						}
					};
/***********************************************************************************************************************/
/*****************EVENEMENTS WINDOW****************EVENEMENTS WINDOW******************EVENEMENTS WINDOW*****************/
/***********************************************************************************************************************/

/***********************************************************************************************************************/
/********************NOUVEAU ROUND*******************NOUVEAU ROUND*********************NOUVEAU ROUND********************/
/***********************************************************************************************************************/
var button = document.querySelector('#next');
var round = 1;

button.onclick =	function()
					{
						round++;
						button.textContent = round + 'eme ROUND';
						
						
						/**************************************************************************/
						var xhr2 = new XMLHttpRequest;

						xhr2.onreadystatechange =	function(e)
													{
														if (xhr2.readyState == 4 && xhr2.status == 200)
														{
															/*var ok = JSON.parse(xhr.responseText);
															
															alert(ok.name);*/
															//alert(parseInt(xhr2.responseText));
															score_level += parseInt(xhr2.responseText);
															setScoreLevel(score_level);
															var tx = document.querySelector('#description_composant').textContent;
															document.querySelector('#description_score').innerHTML = 'SCORE : ' + score_level;
														}
													};

						xhr2.open('GET', '/factoryfun/sendscore', true);
						xhr2.send(null);
						/**************************************************************************/
						
						/**************************************************************************/
						xhr = new XMLHttpRequest;

						xhr.onreadystatechange =	function(e)
													{
														if (xhr.readyState == 4 && xhr.status == 200)
														{
															/*var ok = JSON.parse(xhr.responseText);
															
															alert(ok.name);*/
															generateMachine(xhr.responseText);
														}
													};

						xhr.open('GET', '/factoryfun/extractmachine');
						xhr.send(null);
						/**************************************************************************/
					};
/***********************************************************************************************************************/
/********************NOUVEAU ROUND*******************NOUVEAU ROUND*********************NOUVEAU ROUND********************/
/***********************************************************************************************************************/