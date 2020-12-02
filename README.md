# Draw1SoftDevCA
Vet Clinic CA - Software Development - CCT College

Project Overview:

You have been tasked to create a working program to demonstrate a “Vet Clinic” as a prototype
The Vet Clinic must include the following entities:
- Admin Staff (e.g. Receptionist; IT Nerd)
- Medical Staff (e.g. Veterinarian; Nurse; Trainee Vet)
- Animals (e.g. Dog, Cat, Rabbit)
When the program is executed, it must dynamically create as follows:
- At least 10 Admin staff or various types (they cannot all be the same type). There must
be at least 2 different types of Admin staff.
- At least 30 Medical staff of various types (there must be 5 Vets, and as above, the 30
cannot all be the same type). There must be at least 3 different types of Medical staff.
- At least 1000 animals. There must be at least 3 different types of Animal.

Vet Clinic System
Each staff member must be given (a) a name, (b) a UNIQUE staff number and (c) a salary level. The
Staff name must be randomly generated in some manner (but must be text and should look like a
name!)
Each animal must be given (a) a name, (b) an age (realistic age!) and (c) a medical condition. The
medical condition does not need to be realistic for the animal in question, but should look like an
illness (see example below). Animal names must be generated randomly in some manner (but must
be text and should look like a name)
Once all the entities have been created, the system should assign EACH animal to a member of
medical staff (for treatment). This means you need some way of knowing which Medical Staff
member is assigned to which animal.
As any member of the medical staff will be assigned to treat more than one animal, the order in
which they are going to be looked after is something that must be considered. Once an animal has
been looked after, the doctor needs to know who is the next one.
The system must also assign a task to each member of the Admin staff. These tasks can be invented
by you, but there should be several different tasks – e.g. Filing, Making Phone Calls, On Holidays, etc.
The user should be able to:
BASIC FUNCTIONALITY (Required to achieve a pass / merit)
- List all staff
- List staff by categories (e.g. list all Nurses)
- List all Admin staff performing a certain task
- Search for a specific member of staff by name
- List all animals
- List animals by various types (e.g. list all dogs)
- Search for a specific animal by name
ADDITIONAL FUNCTIONALITY (Required to achieve a Distinction)
- List all the animals assigned to a member of medical staff
- List the order in which pets will be looked after by a particular member of the medical
staff
- For a given member of the medical staff, pass to the next pet.
In order to perform these tasks, you should implement APPROPRIATE constructs, data structures as
well as searching and/or sorting algorithms.

Specific Requirements
The use of built-in data structures is allowed only for arrays, ArrayLists and maps. Other structures,
such as queues and/or stacks MUST BE IMPLEMENTED BY YOURSELF.

Specific Restriction
This is a command line program, and the use of graphic user interfaces is not allowed (i.e. JavaSwing,
JavaFX, GUI builders, etc.).
