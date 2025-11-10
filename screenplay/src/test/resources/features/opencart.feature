Feature: Open web page
  Yo como manuel
  quiero realizar una compra por la pagina web
  Para comprobar el funcionamiento



  @prueba
  Scenario Outline: Compra de articulos en la tienda
    Given "<actor>" abre el navegador
    When el actor agrega los productos al carrito
    And el actor visualiza el carrito
    And el actor completa la información de la compra
    Then debería ver el mensaje de confirmación del pedido


    Examples:
      | actor  | year | month | day |
      | Manuel | 2025 | 10    | 15  |
      #| Manuel | 2026 | 02    | 05  |