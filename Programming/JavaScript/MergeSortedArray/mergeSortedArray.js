const merge = function (nums1, m, nums2, n) {
    var insertPos = m + n - 1;
    m--; n--;
    while (n >= 0) {
        nums1[insertPos--] = (nums1[m] > nums2[n]) ? nums1[m--] : nums2[n--];
    }
};

//sample-test
let nums1 = [1,2,3,0,0,0];
merge(nums1,3,[2,5,6],3);
console.log(nums1);