import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './style.css'

function Navbar(){
  return(
    <header>
      <nav className='container'>
        <div className='wfilme-nav-content'>
          <h1>WDFilmes</h1>
          <a href="https://github.com/warleydev">
            <div className='wfilme-contact-container'>
              <GithubIcon />
              <p className="wfilme-contact-link">/warleydev</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;  