# Webserver V2

## Initial Setup

### Required
```shell
sudo apt install maven mysql-client
snap install flyway
```

### Database
- Run a MySQL server:
  ```shell
  # This assumes you have docker installed
  docker run \
    -d \
    -p 3306:3306 \
    -v $HOME/mysqldata:/var/lib/mysql \
    -e MYSQL_ROOT_PASSWORD=12345678 \
    --name mysql \
    mysql:8.0.26
  ```
- Login to MySQL:
  ```shell
  mysql --host=localhost --port=3306 --protocol=TCP --user=root --password=12345678
  ```
- Create a database called `agriaku`:
  ```sql
  CREATE DATABASE `agriaku`;
  ```
- Create a user called `agriaku` with password: `agriaku`:
  ```sql
  CREATE USER `agriaku`@'%' IDENTIFIED BY 'agriaku';
  ```
- Grant all privileges on the database to the user:
  ```sql
  GRANT ALL PRIVILEGES ON `agriaku`.* TO `agriaku`;
  ```
- Run database migrations:
  ```shell
  ./migrate <test|dev|stg|prod>
  ```

### Build and Run
- To build:
  ```shell
  ./build <clean>
  ```
- To run the app:
  ```shell
  ./run app <dev|stg|prod>
  ```
- To run the cli:
  ```shell
  ./run cli <dev|stg|prod> <command> <args...>
  ```

## JOOQ codegen

To run JOOQ codegen:
```shell
./dbGen/executeAgriaku
```

## Project Structure

- **ports**
  - hexagonal arch port interfaces
- **adapters**
  - hexagonal arch adapter implementations
- **domain**
  - business logic
- **app**
  - App server implementation
- **cli**
  - Command line interface implementation
- **dbGen**
  - JOOQ codegen scripts and config
- **migrations**
  - Flyway migration files