-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 06-Jan-2023 às 17:10
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `db-bookstore`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE `categoria` (
  `id` int(11) NOT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `categoria`
--

INSERT INTO `categoria` (`id`, `descricao`, `nome`) VALUES
(1, 'Horror Livros', 'Horror'),
(2, 'Thriller Livros', 'Thriller'),
(3, 'Mystery Livros', 'Mystery'),
(4, 'Romance Livros', 'Romance'),
(5, 'Poetry Livros', 'Poetry');

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro`
--

CREATE TABLE `livro` (
  `id` int(11) NOT NULL,
  `nome_autor` varchar(50) DEFAULT NULL,
  `texto` mediumtext DEFAULT NULL,
  `titulo` varchar(50) DEFAULT NULL,
  `categoria_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `livro`
--

INSERT INTO `livro` (`id`, `nome_autor`, `texto`, `titulo`, `categoria_id`) VALUES
(1, 'Stephen King', 'Lorem ipsum', 'The Mist', 1),
(2, 'Christopher Buehlman', 'Lorem ipsum', 'Those Across the River', 1),
(3, 'Stephen King', 'Lorem ipsum', 'Salem’s Lot', 1),
(4, 'William Peter Blatty', 'Lorem ipsum', 'The Exorcist', 1),
(5, 'Helen Oyeyemi', 'Lorem ipsum', 'White Is for Witching ', 1),
(6, 'Hannah Morrissey', 'Lorem ipsum', 'The Widowmaker', 2),
(7, 'Amber Garza', 'Lorem ipsum', 'A Mother Would Know', 2),
(8, 'Carol Wyer', 'Lorem ipsum', 'Behind Closed Doors', 2),
(9, 'K.L. Murphy', 'Lorem ipsum', 'THer Sister\'s Death', 2),
(10, 'Sarah A. Denzil', 'Lorem ipsum', 'Find Her', 2),
(11, 'Joël Dicker', 'Lorem ipsum', 'The Enigma of Room 622', 3),
(12, 'Lev AC Rosen', 'Lorem ipsum', 'Lavender House', 3),
(13, ' Adam Hamdy', 'Lorem ipsum', 'The Other Side of Night', 3),
(14, 'Robert Galbraith', 'Lorem ipsum', 'The Ink Black Heart', 3),
(15, 'Megan Goldin', 'Lorem ipsum', 'Stay Awake', 3),
(16, 'Scarlett St. Clair', 'Lorem ipsum', 'Queen of Myth and Monsters', 4),
(17, 'Sophie Lark', 'Lorem ipsum', 'Anastasia', 4),
(18, 'Kate Golden', 'Lorem ipsum', 'A Dawn of Onyx', 4),
(19, 'Kosoko Jackson', 'Lorem ipsum', 'A Dash of Salt and Pepper', 4),
(20, 'Paige Crutcher', 'Lorem ipsum', 'The Lost Witch', 4),
(21, 'Ada Limón', 'Lorem ipsum', 'The Hurting Kind', 5),
(22, 'Atticus', 'Lorem ipsum', 'LVOE: Poems, Epigrams & Aphorisms', 5),
(23, 'Rupi Kaur', 'Lorem ipsum', 'Milk and Honey', 5),
(24, 'Rupi Kaur', 'Lorem ipsum', 'Home Body', 5),
(25, 'Lana Del Rey', 'Lorem ipsum', 'Violet Bent Backwards Over the Grass', 5);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK823wf30ms4bomdmqk9xekpv6c` (`categoria_id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `livro`
--
ALTER TABLE `livro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `livro`
--
ALTER TABLE `livro`
  ADD CONSTRAINT `FK823wf30ms4bomdmqk9xekpv6c` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
