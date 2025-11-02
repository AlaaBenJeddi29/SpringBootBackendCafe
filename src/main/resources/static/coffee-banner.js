setTimeout(() => {
    const swaggerUi = document.querySelector('.swagger-ui');
    if(swaggerUi) {
        swaggerUi.classList.add('my-custom-coffee-theme');
    }

    // Inject welcome banner
    const banner = document.createElement('div');
    banner.innerHTML = `
    <div style="
      background: linear-gradient(135deg, #6f4e37, #8b5a2b);
      color: white;
      padding: 18px;
      text-align: center;
      font-weight: bold;
      font-size: 18px;
      border-radius: 10px;
      margin: 18px;
      box-shadow: 0 6px 15px rgba(0,0,0,0.13);
      border: 3px solid #d4a574;
    ">
      ☕ Welcome to CoffeeShop API — Freshly Brewed Docs! ☕
    </div>`;
    const info = document.querySelector('.info');
    if (info && banner) info.parentNode.insertBefore(banner, info);
}, 650);
