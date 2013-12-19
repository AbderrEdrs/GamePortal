<!DOCTYPE html>
<html>
	<head>
	  <meta charset="utf-8">
	  <title>FactoryFun</title>
	  <link rel="stylesheet" type="text/css" href="/assets/factory/css/style.css">
	</head>
	<body>
		<div id="barre"></div>
		<table id="structure">
			<tbody>
				<tr>
					<td style="width : 1%; height : 100%;">
						<table style="width : 100%; height : 100%;">
							<tbody>
								<tr>
									<td style="height : 200px; vertical-align : top;">
										<div style="width : 400px; height : 179px; background : url('/assets/factory/img/scoreboard.png'); background-size : 400px; background-repeat : no-repeat;">
											<div id="scoreboard" style="position : relative; left : 25px; top : 3px; width : 373px; height : 172px;">
												<img id="score" style="position : absolute; height : 22px; width : 20px;" src=" /assets/factory/img/score.png"/>
											</div>
										</div>
									</td>
								</tr>
								<tr>
									<td style="vertical-align : top;">
										<button id="next" class="btn_validation">1er ROUND</button>
										<div style="background-color : rgba(250,100,100,0.4);">
											<div id="msg" style="line-height : 20px;">La machine MULTIFITTER nécessite d'être alimentée au niveau de son input gauche pour fonctionner correctement.</br>Ce problème doit être réglé si vous voulez passer au 2eme round.</div>
										</div>
									</td>
								</tr>
								<tr>
									<td style="vertical-align : top;">
										<table style="width : 100%;">
											<tbody>
												<tr>
													<td style="width : 30%; vertical-align : top;">
														<div class="title">CONNECTORS</div>
														<table id="connectors" style="width : 100%;">
															<tbody>
																<tr></tr>
															</tbody>
														</table>
													</td>
												</tr>
												<tr>
													<td style="width : 70%; vertical-align : top;"><div class="title">CONTAINERS</div></td>
												</tr>
											</tbody>
										</table>
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
										<div class="title">MACHINES</div>
									</td>
								</tr>
								<tr>
									<td id="containers" style="height : 25%; vertical-align : top;">
										<div class="title">CONTAINERS</div>
									</td>
								</tr>
								<tr>
									<td id="reservoirs" style="height : 25%; vertical-align : top;">
										<div class="title">RESERVOIRS</div>
									</td>
								</tr>
							</tbody>
						</table>
					</td>
				</tr>
			</tbody>
		</table>
	  <script type="text/javascript" src="/assets/factory/js/script.js"></script>

	</body>
</html>
