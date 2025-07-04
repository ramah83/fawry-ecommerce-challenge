# ✅ Fawry E-Commerce System — Internship Challenge

A simple yet structured **Java-based e-commerce system** built for the **Fawry Full Stack Internship** challenge.  
Supports product listing, cart operations, shipping logistics, and checkout validation.

---

## 🌟 Features

| Module | Highlights |
|--------|------------|
| **Products** | 🧀 Expirable & 📦 Shippable product types |
| **Cart** | ➕ Add products with quantity control & validation |
| **Checkout** | 🧾 Subtotal, shipping fees, balance check, and error handling |
| **Shipping** | 📦 Collects and sends only shippable items with name & weight |
| **Validation** | ❌ Handles expired, out-of-stock items & insufficient balance |

---

## 🛠️ Tech Stack

| Layer       | Tech           |
|-------------|----------------|
| **Language**| Java 17        |
| **OOP**     | Interfaces, inheritance, encapsulation |
| **Tools**   | IntelliJ IDEA, Git & GitHub |
| **Build**   | Manual (no Maven/Gradle required) |

---

## 📁 Project Structure

```text
oopTask/
├── src/
│   ├── Main.java                  ← Entry point & use-case simulation
│   ├── Customer.java              ← Handles customer data & balance
│   ├── Product.java               ← Base product class
│   ├── expire_product.java        ← Subclass for expirable items
│   ├── shop_expire_prodect.java   ← Shippable & expirable combo
│   ├── ifShipping.java            ← Interface for shipping (getName & getWeight)
│   └── shopping_Cart.java         ← Cart logic & checkout handling
├── .gitignore
└── README.md
