//schoolJsonDetail = ${schoolDetail};
for( let i in schoolJsonDetail){
	if(schoolJsonDetail[i] == null){
		schoolJsonDetail[i]='';
	}
}
if(schoolJsonDetail.rankOverall == 0 || schoolJsonDetail.rankOverall == -1||schoolJsonDetail.rankOverall == null){
	schoolJsonDetail.rankOverall = 'unranked';
}
$('#schoolName h2').test = schoolJsonDetail.name

$('#schoolName h1').text(schoolJsonDetail.name);
$('#schoolInfoTable')
	.append('<tbody><tr><th scope="row">Rank</th><td>'
		+schoolJsonDetail.rankOverall
		+'</td><th>Location</th><td>'
		+schoolJsonDetail.city+' / '+schoolJsonDetail.state
		+'</td></tr>')
	.append('<tr><th scope="row">Type</th><td>'
		+schoolJsonDetail.type
		+'</td><th>Setting</th><td>'
		+schoolJsonDetail.setting
		+'</td></tr>')
	.append('<tr><th scope="row">Tuition Fee</th><td>'
		+'$'+schoolJsonDetail.tuitionFee+' / year'
		+'</td><th>Room & Board</th><td>'
		+'$'+schoolJsonDetail. roomBoard+ ' / year'
		+'</td></tr>')
	.append('<tr><th scope="row">Student Population</th><td>'
		+schoolJsonDetail.size
		+'</td><th>Application Deadline</th><td>'
		+schoolJsonDetail.applicationDeadline
		+'</td></tr>')
	.append('<tr><th scope="row">Reputation Score</th><td>'
		+schoolJsonDetail.reputationScore
		+'</td><th>Selectivity</th><td>'
		+schoolJsonDetail.selectivity
		+'</td></tr>')
	.append('<tr><th scope="row">GPA (avg)</th><td>'
		+schoolJsonDetail.averageGpa
		+'</td><th>Conditional Admission Offered</th><td>'
		+schoolJsonDetail.conditionalAdmissionOffered
		+'</td></tr>')
	.append('<tr><th scope="row">Website</th><td>'
		+schoolJsonDetail.website
		+'</td><th>Calendar</th><td>'
		+schoolJsonDetail.calendar
		+'</td></tr></tbody>');
	// .append('<tr><th scope="row">Contact</th><td>'
	// 	+schoolJsonDetail.contact
	// 	+'</td></tr>');
$('#schoolTestScoreStatistics')
	.append('<tr><th scope="row">Average SAT1 25%</th><td>'
		+schoolJsonDetail.sat1Percentile25
		+'</td><th>Average SAT1 Score 75%</th><td>'
		+schoolJsonDetail.sat1Percentile75
		+'</td></tr>')
	.append('<tr><th scope="row">Average ACT 25%</th><td>'
		+schoolJsonDetail.actPercentile25
		+'</td><th>Average ACT 75%</th><td>'
		+schoolJsonDetail.actPercentile25
		+'</td></tr>')
	.append('<tr><th scope="row">Required Sat2</th><td>'
		+schoolJsonDetail.numberOfRequiredSat2
		+'</td><th>satActReceivedDeadline</th><td>'
		+schoolJsonDetail.satActReceivedDeadline
		+'</td></tr>')
	.append('<tr><th scope="row">Toefl Accepted Instead Of Sat Or Act</th><td>'
		+schoolJsonDetail.toeflAcceptedInsteadOfSatOrAct
		+'</td><th>Separate Application Form Rrequired</th><td>'
		+schoolJsonDetail.separateApplicationFormRrequired
		+'</td></tr>')
	.append('<tr><th scope="row">Toefl Score (Avg)</th><td>'
		+schoolJsonDetail.averageToeflScore
		+'</td><th>Toefl Score (Min)</th><td>'
		+schoolJsonDetail.minimumToeflScore
		+'</td></tr>')
	.append('<tr><th scope="row">Ielts Score (Avg)</th><td>'
		+schoolJsonDetail.averageIeltsScore
		+'</td><th>Ielts Score (Min)</th><td>'
		+schoolJsonDetail.minimumIeltsScore
		+'</td></tr>');

