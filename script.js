const typed = new Typed(".auto-type", {
  strings: ["Programmer", "Developer", "Coder"],
  typeSpeed: 150,
  backSpeed: 150,
  loop: true,
});

const closeMenu = document.getElementById("close-menu");
const openMenu = document.getElementById("open-menu");
const navMenu = document.getElementById("nav-menu");

closeMenu.style.display = "none";

// to show nav menu
openMenu.addEventListener("click", () => {
  closeMenu.style.display = "block";
  navMenu.classList.toggle("active-nav");
  navMenu.style.display = "flex";
  openMenu.style.display = "none";
});

// to hide nav menu
closeMenu.addEventListener("click", () => {
  openMenu.style.display = "block";
  navMenu.classList.toggle("active-nav");
  navMenu.style.display = "none";
  closeMenu.style.display = "none";
});

// highlight link on active
const links = document.querySelectorAll("li");

links.forEach((item) => {
  item.addEventListener("click", function () {
    // for remove active class
    links.forEach((li) => li.classList.remove("active"));

    // for adding active class
    item.classList.add("active");
  });
});
