setImmediate(function A() {
	console.log("1st immediate");
});
process.nextTick(function C() {
	console.log("1st process");
});
console.log("program started");
