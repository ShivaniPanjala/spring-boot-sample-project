
---
# PostgreSQL Docker Connection

---

## Step 1: Start Docker containers

```bash
docker-compose up -d
docker-compose down
```

* Database: `studentsDB`
* User: `postgres`
* Password: `postgres`
* PostgreSQL Port: `5432`
* pgAdmin Port: `5050`

---

## Step 2: Connect to the database

**Option 1: Using pgAdmin**

1. Open browser: `http://localhost:5050`
2. Login:

    * Email: `admin@admin.com`
    * Password: `admin`
3. Add a new server:

    * Host: `postgres`
    * Port: `5432`
    * Username: `postgres`
    * Password: `postgres`
4. Access `studentsDB` under **Databases**.

---

**Option 2: Using DBeaver**

1. Open DBeaver → New Database Connection → PostgreSQL
2. Enter connection details:

    * Host: `localhost`
    * Port: `5432`
    * Database: `studentsDB`
    * Username: `postgres`
    * Password: `postgres`
3. Test connection → Finish

---
---