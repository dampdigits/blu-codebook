let scoreA = 0, scoreB = 0;

// Update score when buttons are pressed
function updateScore(buttonId) {
	document.querySelector(buttonId).onclick = function() {
		if(buttonId == '#buttonAup') {
			++scoreA;
		}
		else if(buttonId == '#buttonBup') {
			++scoreB;
		}
		else if(buttonId == '#buttonAdown') {
			--scoreA;
		}
		else if(buttonId == '#buttonBdown') {
			--scoreB;
		}
		else {
			scoreA = 0, scoreB = 0;
		}
		document.querySelector('#scoreA').innerHTML = scoreA;
		document.querySelector('#scoreB').innerHTML = scoreB;
	}
}

updateScore('#reset');
updateScore('#buttonAup');
updateScore('#buttonBup');
updateScore('#buttonAdown');
updateScore('#buttonBdown');

let teamA = 'TEAM-A', teamB = 'TEAM-B';

// 
function updateTeamName(tableName, headingName) {
	document.addEventListener('DOMContentLoaded', function () {
		var table = document.querySelector('#scoreTable');
		var headings = table.querySelectorAll(tableName);
		var h1 = document.querySelector(headingName);
		for (var i = 0; i < headings.length; i++) {
			headings[i].addEventListener('click', function () {
				var input = document.createElement('input');
				input.type = 'text';
				input.style.fontSize = '24px';
				input.style.width = '150px';
				input.style.height = '35px';
				input.value = this.textContent;
				this.textContent = '';
				this.appendChild(input);
				input.focus();
				input.addEventListener('input', function () {
					h1.textContent = this.value;
				});
				input.addEventListener('blur', function () {
					this.parentNode.textContent = this.value;
				});
			});
		}
	});
}

updateTeamName('#teamA', '#teamAhead');
updateTeamName('#teamB', '#teamBhead');
