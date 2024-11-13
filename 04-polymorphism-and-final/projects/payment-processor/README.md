# Payment Processor Project

## Project Overview
Create a payment processing system that demonstrates polymorphism and the use of final classes/methods.

## Requirements

### Core Classes

1. `Payment` (Abstract class)
   - Abstract method `processPayment()`
   - Abstract method `validatePayment()`
   - Final method `getTransactionId()`

2. `CreditCardPayment` (Concrete class)
   - Implements credit card-specific validation
   - Handles credit card processing logic

3. `PayPalPayment` (Concrete class)
   - Implements PayPal-specific validation
   - Handles PayPal processing logic

4. `BankTransferPayment` (Concrete class)
   - Implements bank transfer validation
   - Handles bank transfer processing logic

### Required Functionality

1. Payment Processing
   - Amount validation
   - Payment method validation
   - Transaction ID generation
   - Processing status tracking

2. Error Handling
   - Invalid amount exceptions
   - Payment failure handling
   - Timeout handling

3. Reporting
   - Transaction history
   - Payment status tracking
   - Receipt generation

## Project Structure
```bash
payment-processor/
├── src/
│   └── com/
│       └── payment/
│           ├── models/
│           │   ├── Payment.java
│           │   ├── CreditCardPayment.java
│           │   ├── PayPalPayment.java
│           │   └── BankTransferPayment.java
│           ├── services/
│           │   ├── PaymentProcessor.java
│           │   └── ValidationService.java
│           ├── utils/
│           │   ├── IdGenerator.java
│           │   └── PaymentValidator.java
│           └── Main.java
├── test/
│   └── com/
│       └── payment/
│           └── tests/
└── README.md
