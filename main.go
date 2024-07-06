package main

import (
	lang "customlang/src"
	"fmt"
)

func main() {
	expression := "(5+5.5)/2 + 3"
	ans := lang.Execute(expression)
	fmt.Println(ans)
}
