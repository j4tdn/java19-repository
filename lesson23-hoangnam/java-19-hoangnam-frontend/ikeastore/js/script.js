function loadHeader() {
  fetch("components/header.html")
    .then((response) => response.text())
    .then((data) => {
      document.getElementById("header-container").innerHTML = data;
    })
    .catch((error) => console.error("Error loading header:", error));
}

function loadNavbar() {
  fetch("components/navbar.html")
    .then((response) => response.text())
    .then((data) => {
      document.getElementById("navbar-container").innerHTML = data;
    })
    .catch((error) => console.error("Error loading navbar:", error));
}

function loadFooter() {
  fetch("components/footer.html")
    .then((response) => response.text())
    .then((data) => {
      document.getElementById("footer-container").innerHTML = data;
    })
    .catch((error) => console.error("Error loading footer:", error));
}

window.onload = function () {
  loadHeader();
  loadNavbar();
  loadFooter();
};
document.addEventListener("DOMContentLoaded", function () {
  const tabs = document.querySelectorAll(".product-tab");
  const productLists = document.querySelectorAll(".product-list");

  tabs.forEach((tab) => {
    tab.addEventListener("click", function () {
      tabs.forEach((t) => t.classList.remove("active"));
      tab.classList.add("active");

      productLists.forEach((list) => list.classList.remove("active"));
      const targetId = tab.getAttribute("data-target");
      document.getElementById(targetId).classList.add("active");
    });
  });
});

let currentIndex = 0;
showTestimonial(currentIndex);

function currentTestimonial(n) {
  showTestimonial((currentIndex = n - 1));
}

function showTestimonial(n) {
  const testimonials = document.getElementsByClassName("testimonial");
  const dots = document.getElementsByClassName("dot");
  if (n >= testimonials.length) currentIndex = 0;
  if (n < 0) currentIndex = testimonials.length - 1;

  for (let i = 0; i < testimonials.length; i++) {
    testimonials[i].style.display = "none";
    dots[i].className = dots[i].className.replace(" active", "");
  }

  testimonials[currentIndex].style.display = "block";
  dots[currentIndex].className += " active";
}

setInterval(() => {
  currentTestimonial(currentIndex + 2);
}, 5000);
