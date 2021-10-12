package main

import "testing"

func TestIsPailndrome(t *testing.T) {
	tests := []struct {
		input    int
		expected bool
	}{
		{123, false},
		{10, false},
		{121, true},
		{-121, false},
		{-123, false},
		{1123211, true},
	}

	for _, tt := range tests {
		actual := IsPalindrome(tt.input)

		if actual != tt.expected {
			t.Errorf("actual %t expected %t", actual, tt.expected)
		}
	}
}
