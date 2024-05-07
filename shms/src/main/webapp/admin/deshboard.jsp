<!-- Navigation Bar -->
<%@ include file="navbar.jsp"%>
<%@ include file="../sidebar.jsp"%>
<!-- Content Area with Centered Buttons -->

<!-- Start main global viewport -->
<div id="main" class="main">

	<!-- Start Quick Action bar -->
	<div class="quickAccessBar">This is quick access bar</div>
	<!-- -->
	<!-- Start Dashbord and last transaction -->
	<div class="mainView">
		<!-- OverView grid -->
		<div class="overView" style="flex: 3;">
			<!-- overview row 1 -->
			<div class=" overViewRow" style="">
				<!-- Cell 1 -->
				<div class=" deposite overViewCell" style="">
					<%@ include file="/icons/depositeIcon.jsp"%>
					<div class="cellElement">
						<h3 class="balance" style="font-size: 50px">
							1000 <i class="fa-solid fa-bangladeshi-taka-sign"></i>
						</h3>
						<button class="btn2">Details</button>
					</div>
				</div>
				<!-- Cell 2 -->
				<div class=" expense overViewCell" style="">
					<%@ include file="/icons/expensesIcon.jsp"%>
					<div class="cellElement">
						<h3 class="balance" style="font-size: 50px">
							1000 <i class="fa-solid fa-bangladeshi-taka-sign"></i>
						</h3>
						<button class="btn2">Details</button>
					</div>
				</div>
			</div>
			<!-- overview row 2 -->
			<div class=" overViewRow">
				<!-- Cell 4 -->
				<div class=" consumes overViewCell" style="">
					<%@ include file="/icons/consumes.jsp"%>
					<div class="cellElement">
						<h3 class="balance" style="font-size: 50px">
							1000 <i class="fa-solid fa-bangladeshi-taka-sign"></i>
						</h3>
						<button class="btn2">Details</button>
					</div>
				</div>
				<!-- Cell 4 -->
				<div class=" remaining overViewCell" style=""><%@ include
						file="/icons/remainingIcon.jsp"%>
					<div class="cellElement">
						<h3 class="balance" style="font-size: 50px">
							1000 <i class="fa-solid fa-bangladeshi-taka-sign"></i>
						</h3>
						<button class="btn2">Details</button>
					</div>
				</div>
			</div>
		</div>



		<!-- Last transactions -->

		<div style="overflow-y: auto; flex: 7;" class="lastTransactions">

			<table>

				<thead style="">

					<tr></tr>
					<tr>
						<th>TIME</th>
						<th>DESC</th>
						<th>TAKA</th>
						<th>TRAS</th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td>12/21/2023 :</td>
						<td>Tran</td>
						<td>Description: kajsdfljkasdfj</td>
						<td>345345</td>

					</tr>

					<tr>
						<td>12/21/2023 :</td>
						<td>Tran</td>
						<td>Description: kajsdfljkasdfj</td>
						<td>345345</td>

					</tr>
					<tr>
						<td>12/21/2023 :</td>
						<td>Tran</td>
						<td>Description: kajsdfljkasdfj</td>
						<td>345345</td>

					</tr>

					<tr>
						<td>12/21/2023 :</td>
						<td>Tran</td>
						<td>Description: kajsdfljkasdfj</td>
						<td>345345</td>

					</tr>
					<tr>
						<td>12/21/2023 :</td>
						<td>Tran</td>
						<td>Description: kajsdfljkasdfj</td>
						<td>345345</td>

					</tr>


					<tr>
						<td>12/21/2023 :</td>
						<td>Tran</td>
						<td>Description: kajsdfljkasdfj</td>
						<td>345345</td>

					</tr>
					<tr>
						<td>12/21/2023 :</td>
						<td>Tran</td>
						<td>Description: kajsdfljkasdfj</td>
						<td>345345</td>

					</tr>

					<tr>
						<td>12/21/2023 :</td>
						<td>Tran</td>
						<td>Description: kajsdfljkasdfj</td>
						<td>345345</td>

					</tr>
					<tr>
						<td>12/21/2023 :</td>
						<td>Tran</td>
						<td>Description: kajsdfljkasdfj</td>
						<td>345345</td>

					</tr>
			</table>
		</div>




	</div>





</div>



