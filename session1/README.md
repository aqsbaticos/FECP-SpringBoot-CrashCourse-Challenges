# (Output) Lab 6: Define Your REST API Endpoints
|Work Email  |andric.baticos@gcash.com|                                                               |         |                                                                 |
|------------|------------------------|---------------------------------------------------------------------|---------------|-----------------------------------------------------------------------|
|Resources   |HTTP Verb               |Resource URL                                                         |Request Body   |Use Case Representation                                                |
|Handler     |POST                    |/zoos/{zoo_id}/enclosures/{enclosure_id}/animals/{animal_id}/feed    |{}             |Feed an animal                                                         |
|Handler     |POST                    |/zoos/{zoo_id}/enclosures/{enclosure_id}/animals/{animal_id}/examine |{}             |Examine an animal                                                      |
|Handler     |POST                    |/zoos/{zoo_id}/enclosures/{enclosure_id}/animals/{animal_id}/hospital|{ hospital_id }|Send an animal to the hospital                                         |
|Handler     |POST                    |/zoos/{zoo_id}/enclosures/{enclosure_id}/animals/{animal_id}/exercise|{}             |Exercise an animal                                                     |
|Manager     |GET                     |/zoos/{zoo_id}/handlers                                              |{}             |Get all handlers in an enclosure                                       |
|Manager     |GET                     |/zoos/{zoo_id}/handlers/{handler_id}                                 |{}             |Get handler details                                                    |
|Veterinarian|GET                     |/zoo/{zoo_id}/hospitals/{hospital_id}/animals                        |{}             |Get all animals in the hospital                                        |
|Veterinarian|POST                    |/zoos/{zoo_id}/hospitals/{hospital_id}/animals/{animal_id}/heal      |{}             |Heal an animal                                                         |
|Veterinarian|POST                    |/zoos/{zoo_id}/hospitals/{hospital_id}/lecture                       |{}             |Give a lecture in a hospital                                           |
|Visitor     |GET                     |/zoos/{zoo_id}/hospitals/{hospital_id}/lectures/attend               |{}             |Attend a lecture in the hospital                                       |
|Visitor     |POST                    |/zoos/{zoo_id}/enclosures/{enclosure_id}/animals/{animal_id}/feed    |{}             |Feed an animal                                                         |
|Visitor     |POST                    |/zoos/{zoo_id}/enter                                                 |{}             |Enter the zoo                                                          |
|Visitor     |POST                    |/zoos/{zoo_id}/leave                                                 |{}             |Leave the zoo                                                          |
|Visitor     |GET                     |/zoos/{zoo_id}/shops/{shop_id}                                       |{}             |Get shop details (TicketShop will return a different body than Shop)   |
|Visitor     |POST                    |/zoos/{zoo_id}/shops/{shop_id}/buy                                   |{}             |Buy a product (TicketShop will return Ticket, Shop will return Product)|
