function displayDate(times) {
  const now = new Date();
  let day = now.getDate();
  let month = now.getMonth() + 1; 
  let year = now.getFullYear();
  if (day < 10) {
    day = '0' + day;
  }
  if (month < 10) {
    month = '0' + month;
  }

  for (let i = 0; i < times; i++) {
    console.log(day + '-' + month + '-' + year);
  }
}

displayDate(5);
