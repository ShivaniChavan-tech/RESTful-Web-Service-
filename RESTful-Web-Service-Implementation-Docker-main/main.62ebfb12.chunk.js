(this["webpackJsonprest-service"]=this["webpackJsonprest-service"]||[]).push([[0],{21:function(e,t,c){},41:function(e,t,c){"use strict";c.r(t);var s=c(2),n=c.n(s),r=c(14),i=c.n(r),l=(c(21),c(16)),j=c(15),o=c.n(j),d=c(0);var a=function(){var e=n.a.useState(null),t=Object(l.a)(e,2),c=(t[0],t[1]);return n.a.useEffect((function(){o.a.get("http://localhost:8080/customers").then((function(e){c(e.data.Customers),console.log(JSON.stringify(e.data.Customers))})).catch((function(e){return console.log("Error: ".concat(e))}))}),[]),Object(d.jsxs)("div",{className:"App",children:[Object(d.jsx)("header",{className:"App-header"}),Object(d.jsx)("div",{className:"container",children:Object(d.jsx)("h2",{children:"Customer Details"})}),Object(d.jsx)("div",{className:"container",children:Object(d.jsxs)("table",{className:"table table-striped",children:[Object(d.jsx)("thead",{children:Object(d.jsxs)("tr",{children:[Object(d.jsx)("th",{scope:"col",children:"#"}),Object(d.jsx)("th",{scope:"col",children:"Name"}),Object(d.jsx)("th",{scope:"col",children:"Region"}),Object(d.jsx)("th",{scope:"col",children:"Phone Number"}),Object(d.jsx)("th",{scope:"col",children:"Email"}),Object(d.jsx)("th",{children:"View Details"}),Object(d.jsx)("th",{children:"View Orders"})]})}),c.map((function(e){return Object(d.jsx)(d.Fragment,{children:Object(d.jsx)("tbody",{children:Object(d.jsxs)("tr",{children:[Object(d.jsx)("th",{scope:"row",children:e.userId}),Object(d.jsx)("td",{children:e.firstName+e.lastName}),Object(d.jsx)("td",{children:e.region}),Object(d.jsx)("td",{children:e.phoneNumber}),Object(d.jsx)("td",{children:e.emailAddress}),Object(d.jsx)("td",{children:Object(d.jsx)("button",{className:"btn btn-primary",onClick:function(){e.userId},children:" Get Customer Details "})}),Object(d.jsxs)("td",{children:[Object(d.jsx)("button",{className:"btn btn-success",onClick:function(){e.orderId},children:" Get Orders "})," "]})]})})})}))]})})]})},h=function(e){e&&e instanceof Function&&c.e(3).then(c.bind(null,42)).then((function(t){var c=t.getCLS,s=t.getFID,n=t.getFCP,r=t.getLCP,i=t.getTTFB;c(e),s(e),n(e),r(e),i(e)}))};i.a.render(Object(d.jsx)(n.a.StrictMode,{children:Object(d.jsx)(a,{})}),document.getElementById("root")),h()}},[[41,1,2]]]);
//# sourceMappingURL=main.62ebfb12.chunk.js.map